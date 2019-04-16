package brinqa

class Cart {

    static belongsTo = [owner: User]
    static hasMany = [items: Item]

    static constraints = {}
}