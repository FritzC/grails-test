package brinqa

import utils.Role

class User {

    String username
    String password
    Role role
    Cart cart

    static hasMany = [wishLists: WishList]

    static constraints = {}

    User(username, password, role) {
        this.username = username
        this.password = password
        this.role = role
    }

    def beforeValidate() {
        if (cart == null) {
            cart = new Cart()
            cart.owner = this
            cart.save()
        }
    }
}
