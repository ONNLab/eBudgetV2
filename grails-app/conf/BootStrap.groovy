import net.onnlab.crru.*
import net.onnlab.crru.auth.*

class BootStrap {

    def init = { servletContext ->
        def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true) 
        def budgetRole = new Role(authority: 'ROLE_BUDGET').save(flush: true)
        def testUser = new User(username: 'me', password: 'password') 
        testUser.save(flush: true)

        UserRole.create testUser, budgetRole, true
        UserRole.create testUser, adminRole, true

        assert User.count() == 1 
        assert Role.count() == 2 
        assert UserRole.count() == 2

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
