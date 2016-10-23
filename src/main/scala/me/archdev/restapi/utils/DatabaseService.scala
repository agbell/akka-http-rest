package me.archdev.restapi.utils

import slick.backend.DatabaseConfig
import slick.driver.{PostgresDriver, SQLiteDriver}


class DatabaseService() {

  val driver = slick.driver.PostgresDriver
  import driver.api._
  val dbConfig: DatabaseConfig[SQLiteDriver] = DatabaseConfig.forConfig("litedb")
  val db = dbConfig.db
  db.createSession()
}
