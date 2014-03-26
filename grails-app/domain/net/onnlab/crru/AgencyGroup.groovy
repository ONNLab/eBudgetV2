package net.onnlab.crru

class AgencyGroup {
	String groupName

	static hasMany = [agencies: Agency]
    static constraints = {
    	groupName blank:false , unique: true
    }

    String toString() {groupName}
}
