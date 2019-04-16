package brinqa

import utils.Role

class BootStrap {

    def init = { servletContext ->
        def admin = new User('admin', 'admin', Role.ADMIN).save()
        def customer1 = new User('customer1', 'customer1', Role.CUSTOMER).save()
        def customer2 = new User('customer1', 'customer1', Role.CUSTOMER).save()
        def item1 = new Item('test item', 10.0).save()
        def item2 = new Item('test item 2', 20.5).save()
        def item3 = new Item('test item 3', 6.25).save()
        def wishlist = new WishList("test wishlist")
        wishlist.owner = admin
        wishlist.save()
        wishlist = new WishList("test wishlist 2")
        wishlist.owner = admin
        wishlist.save()
    }

    def destroy = {
    }
}
