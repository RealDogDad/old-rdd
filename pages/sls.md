# Serverless Artillery and How to
### Prereqs:
 - [ ] NPM installed
 - [ ] AWS cli installed
 - [ ] serverless installed
 - [ ] serverless-artillery installed

- 1 Run `aws configure`
- 2 Enter AWS Credentials
- 3 Export `AWS_ACCESS_KEY` to environment with `export AWS_ACCESS_KEY_ID=<access-key-id>`
- 4 Export `AWS_SECRET_ACCESS_KEY` to environment with `export AWS_SECRET_ACCESS_KEY_ID=<secret-access-key>`
- 5 Install `serverless` with `$ npm install -g serverless`
- 6 Install `serverless-artillery` with `$ npm install -g serverless-artillery`
- 7 Generate SLS script.yaml with `slsart script`
- 8 Open `script.yaml` with editor
- 9 Change endpoint and parameters to fit. Save and close
- 10 Deploy local assets to AWS with `slsart deploy -stageName 'meaningful-name'`
- 11 Initialize test with `slsart invoke -stageName 'meaningful-name'`
- 12 Await results directly in your terminal