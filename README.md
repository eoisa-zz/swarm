# SWARM

## Setup
You'll need to have a postgres server setup with `swarm_db` created. If the database
was previously setup and a new migration has been added, you'll need to run the command
`DROP SCHEMA public CASCADE;` in the `swarm_db` database; this will drop the public 
schema and allow hibernate to rehydrate the database. _This will delete all the data in
the database._ 

## General order of development

### Swarm API
swagger documentation can be found at:
* http://{server}:{port}/api/v0/swarm/swagger-ui.html

#### Hives
Each hive has its own swarm, a swarm is a collection of nodes.

#### Node
Each node is a single swarm unit that should be able to report it's health,
ultimate location, and current bearing. 