import net.onnlab.crru.BudgetYear
import net.onnlab.crru.AgencyGroup
import net.onnlab.crru.Agency
import net.onnlab.crru.BudgetType
import net.onnlab.crru.AllocateItemDetail
import net.onnlab.crru.AllocateItem
import net.onnlab.crru.AgencyGroup
import net.onnlab.crru.BudgetOutcome
import net.onnlab.crru.ExpenseGroup
import net.onnlab.crru.BudgetPlan
import net.onnlab.crru.AllocateBudgetStatus

class BootStrap {

    def init = { servletContext ->
    	new BudgetYear(yearID: 2558 ,
    		startDate: Date.parse("yyyy-MM-dd", "2014-10-01") ,
    		endDate:Date.parse("yyyy-MM-dd", "2015-09-30")).save()

    	new Agency(name:"Faculty of Science", groupName : new AgencyGroup(groupName: "Faculty").save()).save()
    	new Agency(name:"Office of president", groupName : new AgencyGroup(groupName: "Office").save()).save()

    	new BudgetType(name:"National Budget").save()
    	new BudgetType(name:"University Budget").save()

    	new AllocateItemDetail(name:"Salary",itemGroup: new AllocateItem(name: "Human Resource").save()).save()

    	new BudgetOutcome(name:"Project Asian",planName: new BudgetPlan(name:"Ready to join Asian").save()).save()

    	new ExpenseGroup(name:"Human Resource").save()
    	new ExpenseGroup(name:"Working").save()
    	new ExpenseGroup(name:"Investment").save()

    	new AllocateBudgetStatus(name:"Must have project").save()
    	new AllocateBudgetStatus(name:"No project").save()


    }
    def destroy = {
    }
}
