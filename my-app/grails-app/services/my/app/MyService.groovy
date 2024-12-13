package my.app

import grails.gorm.transactions.Transactional
import my.plugin.PluginService

@Transactional
class MyService {

    PluginService pluginService

    def serviceMethod() {
        pluginService.serviceMethod()
    }
}
