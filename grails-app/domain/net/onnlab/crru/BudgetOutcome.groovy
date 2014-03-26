package net.onnlab.crru

class BudgetOutcome {
	String name
	BudgetPlan planName

    static constraints = {
    	name blank:false ,unique:true
    	planName blank:false
    }

    String toString() {name+ " [ " +planName.toString() + " ]"}
}
