package net.onnlab.crru

class ExpenseGroup {
	String name

    static constraints = {
    	name blank:false ,unique:true
    }

    String toString() {name}
}
