# SWARM

## Setup
You'll need to have a postgres server setup with `swarm_db` created. If the database
was previously setup and a new migration has been added, you'll need to run the command
`DROP SCHEMA public CASCADE;` in the `swarm_db` database; this will drop the public 
schema and allow hibernate to rehydrate the database. _This will delete all the data in
the database._ 

### General order of development

Swarm API:
* add - adds a node to the swarm
* remove - removes a node from the swarm
* report (per node)
    * status
        * Health - how much life does a node have available
        * Location - last known gps coordinate of node
        
Node
* current bearing
* current life