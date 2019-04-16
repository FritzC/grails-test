package brinqa


class WishListInterceptor {

    boolean before() { 
        if (session.user == null) {
            redirect (controller: "Home", action: "index")
            return false
        } 
        return true
    }

    boolean after() { true }

    void afterView() {}

}
