package brinqa

class WishListController {

    def breforeInterceptor = [action: this.&authorize]

    private authorize() {
        if (session.user == null) {
            redirect (controller: "Home", action: "index")
            return false
        }
    }

    def index() {
        redirect(action: 'list')
    }

    def list() {
        [wishLists: WishList.findAllByOwner(session.user)]
    }

    def view() {
        [wishList: WishList.get(params.id)]
    }

    def deleteWishList() {
        Long id = session.user.id.toLong();
        User user = User.get(id);
        def wishList = WishList.get(params.wishListId)
        wishList.items.clear()
        user.removeFromWishLists(wishList)
        wishList.delete()
        user.save(flush: true)
        redirect(action: 'list')
    }

    def addWishList() {
        Long id = session.user.id.toLong();
        User user = User.get(id);
        def wishList = new WishList(params.wishListName)
        wishList.owner = user
        wishList.save()
        user.addToWishLists(wishList)
        user.save(flush: true)
        redirect(action: 'list')
    }

    def removeItem() {
        def wishList = WishList.get(params.wishListId)
        def item = Item.get(params.itemId)
        wishList.removeFromItems(item)
        item.removeFromWishLists(wishList)
        item.save()
        wishList.save(flush: true)
        redirect(action: 'index')
    }

    def empty() {
        def wishList = WishList.get(params.wishListId)
        wishList.items.clear()
        wishList.save(flush: true)
        redirect(action: "list")
    }

}