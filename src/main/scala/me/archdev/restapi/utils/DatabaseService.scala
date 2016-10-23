package me.archdev.restapi.utils

import slick.backend.DatabaseConfig
import slick.driver.PostgresDriver


class DatabaseService() {

  val driver = slick.driver.PostgresDriver
  import driver.api._
  val dbConfig: DatabaseConfig[PostgresDriver] = DatabaseConfig.forConfig("pgdb")
  val db = dbConfig.db
//  val db = Database.forConfig("pgdb")
  db.createSession()
}
