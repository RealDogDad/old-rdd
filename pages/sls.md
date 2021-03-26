# Serverless Artillery and How to
### Prereqs:
 - [ ] NPM installed
 - [ ] AWS cli installed
 - [ ] serverless installed
 - [ ] serverless-artillery installed

- 1 Run `aws configure`
- 1 Enter AWS Credentials
- 1 Export `AWS_ACCESS_KEY` to environment with `export AWS_ACCESS_KEY_ID=<access-key-id>`
- 1 Export `AWS_SECRET_ACCESS_KEY` to environment with `export AWS_SECRET_ACCESS_KEY_ID=<secret-access-key>`
- 1 Install `serverless` with `$ npm install -g serverless`
- 1 Install `serverless-artillery` with `$ npm install -g serverless-artillery`
- 1 Generate SLS script.yaml with `slsart script`
- 1 Open `script.yaml` with editor
- 1 Change endpoint and parameters to fit. Save and close
- 1 Deploy local assets to AWS with `slsart deploy -stageName 'meaningful-name'`
- 1 Initialize test with `slsart invoke -stageName 'meaningful-name'`
- 1 Await results directly in your terminal