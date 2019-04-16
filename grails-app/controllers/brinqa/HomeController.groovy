package brinqa

class HomeController {

    def index() {
        [:]
    }

    def login() {
        def user = User.findByUsername(params.username)
        if (user != null && user.password == params.password) {
            session.user = user
        }
        redirect(action: "index")
    }

    def logout() {
        session.user = null
        redirect(action: "index")
    }
}