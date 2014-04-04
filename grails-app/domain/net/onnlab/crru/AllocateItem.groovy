package net.onnlab.crru

class AllocateItem {
	String name

	static hasMany = [details: AllocateItemDetail]
    static constraints = {
    	name blank:false , unique:true
    }

    String toString() {name}
}
