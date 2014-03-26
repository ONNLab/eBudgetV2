package net.onnlab.crru

class BudgetType {
	String name
    static constraints = {
    	name blank: false , unique: true
    }

    String toString() {name}
}
