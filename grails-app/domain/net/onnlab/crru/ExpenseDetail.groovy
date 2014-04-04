package net.onnlab.crru

class ExpenseDetail {
	String name
	ExpenseGroup groupName
    static constraints = {
    	name blank:false,unique:true
    	groupName blank:false
    }

    String toString() {name + "[ " + groupName.toString() + " ]"}
}
