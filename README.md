# Sample

## Queries

[`mutation{register(nric:"", password:"")}`](https://localhost:8080/graphiql?query=mutation%7Bregister(nric%3A%22%22%2C%20password%3A%22%22)%7D)
[`query{login(nric:"", password:"")}`](https://localhost:8080/graphiql?query=query%7Blogin(nric%3A%22%22%2C%20password%3A%22%22)%7D)

## cURL

```
curl -k 'https://localhost:8080/graphql' \
-H "Content-Type: application/json" \
-d '{
    "query": "mutation{register(nric:\u0022\u0022,password:\u0022\u0022)}"
}'
```

```
curl -k 'https://localhost:8080/graphql' \
-H "Content-Type: application/json" \
-d '{
    "query": "mutation($nric:String!,$password:String!){register(nric:$nric,password:$password)}",
    "variables": {"nric":"", "password":""}
}'
```