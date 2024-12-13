package my.plugin

import grails.gorm.transactions.Transactional

@Transactional
class PluginService {

    def serviceMethod() {
        log.info("plugin service method!")
    }
}
