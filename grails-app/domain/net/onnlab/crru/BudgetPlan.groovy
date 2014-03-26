package net.onnlab.crru

class BudgetPlan {
	String name

	static hasMany = [outcome: BudgetOutcome]
	
    static constraints = {
    	name blank:false , unique:true
    }

    String toString() {name}
}
