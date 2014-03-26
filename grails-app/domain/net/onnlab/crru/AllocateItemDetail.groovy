package net.onnlab.crru

class AllocateItemDetail {
	String name
	AllocateItem itemGroup
    static constraints = {
    	name blank:false,unique:true
    	itemGroup nullable:false
    }

    String toString(){name + "[ " + itemGroup.toString() + "]"}
}
