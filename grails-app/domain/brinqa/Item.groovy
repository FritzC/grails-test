package brinqa

class Item {

    String name
    Double cost

    static hasMany = [wishLists: WishList, carts: Cart]
    static belongsTo = [WishList, Cart]

    static constraints = {
    }

    Item(name, cost) {
        this.name = name
        this.cost = cost
    }
}
