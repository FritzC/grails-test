package brinqa

class WishList {

    String name
    
    static belongsTo = [owner: User]
    static hasMany = [items: Item]

    static constraints = {}
    
    String toString() {
        "${name}"
    }

    WishList(name) {
        this.name = name
    }

}