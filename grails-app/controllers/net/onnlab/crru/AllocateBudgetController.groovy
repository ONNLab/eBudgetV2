package net.onnlab.crru
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN', 'ROLE_BUDGET'])
class AllocateBudgetController {

    static scaffold = true
}
