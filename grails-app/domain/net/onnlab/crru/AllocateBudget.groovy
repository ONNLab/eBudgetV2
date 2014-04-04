package net.onnlab.crru

class AllocateBudget {
	BudgetYear year
	Agency agenciesName
	BudgetType budgetType
	AllocateItemDetail itemName
	BudgetOutcome outcome
	ExpenseGroup expenseGroup 
	AllocateBudgetStatus status
	BigDecimal budget = 0.00

    static constraints = {
    	year nullable:false 
    	agenciesName nullable:false
    	budgetType nullable:false
    	itemName nullable:false
    	outcome nullable:true
    	expenseGroup nullable:true
    	status nullable:false
    	budget min:0.0 ,scale :2 ,blank:false
    }
}
