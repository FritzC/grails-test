package brinqa

class CartController {

    def index() {
        redirect(action: "list")
    }

    def list() {
        Long id = session.user.id.toLong()
        User user = User.get(id)
        [itemList: user.cart.items]
    }

    def empty() {
        Long id = session.user.id.toLong()
        User user = User.get(id)
        user.cart.items.clear()
        user.cart.save(flush: true)
        redirect(action: "list")
    }

    def remove() {
        Long id = session.user.id.toLong()
        User user = User.get(id)
        user.cart.removeFromItems(Item.get(params.id))
        user.cart.save(flush: true)
        redirect(action: "list")
    }

}