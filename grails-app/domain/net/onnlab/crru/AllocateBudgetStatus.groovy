package net.onnlab.crru

class AllocateBudgetStatus {
	String name

    static constraints = {
    	name blank:false, unique:true
    }

    String toString() {name}
}
