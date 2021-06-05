package main.groovy.ifmo

class FirstClass {
    Integer id
    Boolean isBlocked
    def binding

    FirstClass(Integer id, Boolean isBlocked){
        this.id = id
        this.isBlocked = isBlocked
    }

    FirstClass(){
        this.binding = new Binding(id:21,isBlocked:false)
    }

    Integer getId(){
        id
    }
}
