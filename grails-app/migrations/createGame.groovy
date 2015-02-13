databaseChangeLog = {

	changeSet(author: "mfreake (generated)", id: "1423259153997-1") {
		createTable(tableName: "game") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "gamePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "description", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "price", type: "double") {
				constraints(nullable: "false")
			}
		}
	}
}
