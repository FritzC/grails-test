package brinqa

import utils.Role

class ItemController {

    def breforeInterceptor = [action: this.&authorize]

    private authorize() {
        if (session.user == null) {
            redirect (controller: "Home", action: "index")
            return false
        }
    }

    def index() {
        redirect(action: "list")
    }

    def list() {
        Long id = session.user.id.toLong()
        User user = User.get(id)
        [itemList: Item.list(), isAdmin: user.role == Role.ADMIN]
    }

    def view() {
        Long id = session.user.id.toLong()
        User user = User.get(id)
        [item: Item.get(params.id), wishLists : WishList.findAllByOwner(user), isAdmin: user.role == Role.ADMIN]
    }

    def delete() {
        def item = Item.get(params.id)
        item.delete(flush: true)
        redirect(action: 'index')
    }
    
    def create() {}

    def edit() {
        [item: Item.get(params.id)]
    }

    def saveEdit() {
        def item = Item.get(params.id)
        item.name = params.itemName
        item.cost = Double.parseDouble(params.itemCost)
        item.save(flush: true)
        redirect(action: 'index')
    }

    def saveNew() {
        def item = new Item(params.itemName, Double.parseDouble(params.itemCost))
        item.save(flush: true)
        redirect(action: 'index')
    }

    def addToWishList() {
        def wishList = WishList.get(params.wishListId);
        def item = Item.get(params.id)
        wishList.addToItems(item)
        item.addToWishLists(wishList)
        item.save()
        wishList.save(flush: true)
        redirect(action: 'index')
    }

    def addToCart() {
        Long id = session.user.id.toLong()
        User user = User.get(id)
        def cart = user.cart
        def item = Item.get(params.id)
        cart.addToItems(item)
        item.addToCarts(cart)
        item.save()
        cart.save(flush: true)
        redirect(action: 'index')
    }

}