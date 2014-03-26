package net.onnlab.crru

class Agency {
	String name
	AgencyGroup groupName

    static constraints = {
    	name blank: false, unique: true
    	groupName blank: false
    }

    String toString() {name + " [ " + groupName.toString() + " ] "}
}
