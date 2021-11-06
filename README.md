# Project Specification

## Table of Contents

1. [**Requirements**](#Requirements)
2. [**Existing Project Structure**](#Existing-Project-Structure)
3. [**New Project Structure**](#New-Project-Structure)
4. [**SETUP: Cloud Method**](#SETUP-Cloud-Method)
5. [**SETUP: Local Method**](#SETUP-Local-Method)
6. [**Services**](#Services)
7. [**DTOs**](#DTOs)

## Requirements

As a team, decide the best microservice architecture. Consider where edge services might be advantageous and necessary
individual services. Make sure that you are designing together how the application will be broken into services before
starting.

Then, rebuild the exact project from the ground up utilizing microservices architecture and creating API routes for
every current CLI command.

Remember to make the application as robust as possible.

## Existing Project Structure

<a href="https://github.com/EN-IH-WDPT-JUN21/Stolen-Name-LBL-Trucking_Company_Homework-3"> Stolen-Name-LBL-Trucking_Company_Homework-3 </a>

<img src="Class_diagram_LBL-Page-1.png" />

## New Project Structure

<img src="Project_Diagram.PNG" />

## SETUP: Cloud Method

* Use this gateway as normal: https://cshark-h4.herokuapp.com
* When requesting from the cloud gateway, sometimes it will take a few seconds to initialize all the services. Please be
  patient, and refresh the request.
* All request must have login authentication.
    * Sales rep can access all routes except for: POST** - "/create/salesrep"
    * Admin can access all routes

Authentication for sales rep:

```
login: salesrep
password: salesrep
```

Authentication for admin:

```
login: admin
password: admin
```

| Route Type |                  Route                 |            Input Required           |    Service Called   |
|:----------:|:--------------------------------------:|:-----------------------------------:|:-------------------:|
| POST       | "/create/contact"                      | ContactDTO                          | CREATE-SERVICE      |
| POST       | "/create/opportunity"                  | OpportunityDTO                      | CREATE-SERVICE      |
| POST       | "/create/lead"                         | LeadDTO                             | CREATE-SERVICE      |
| POST       | "/create/account"                      | AccountDTO                          | CREATE-SERVICE      |
| POST**     | "/create/salesrep"                     | SalesRepDTO                         | CREATE-SERVICE      |
| POST       | "/create/contact-opportunity"          | ContactAndOpportunityDTO            | CREATE-SERVICE      |
| POST       | "/create/contact-opportunity-account"  | ContactAndOpportunityAndAccountDTO  | CREATE-SERVICE      |
| POST       | "/convert/lead{id}"                    | Long: leadId, LeadConvertDTO        | CONVERT-SERVICE     |
| PUT        | "/convert/opportunity/{id}/{status}"   | Long: opportunityId, String: status | CONVERT-SERVICE     |
| GET        | "/report/bySalesRep/{dataType}"        | String: dataType                    | REPORT-SERVICE      |
| GET        | "/report/byProduct/{dataType}"         | String: dataType                    | REPORT-SERVICE      |
| GET        | "/report/byCountry/{dataType}"         | String: dataType                    | REPORT-SERVICE      |
| GET        | "/report/byCity/{dataType}"            | String: dataType                    | REPORT-SERVICE      |
| GET        | "/report/byIndustry/{dataType}"        | String: dataType                    | REPORT-SERVICE      |
| GET        | "/report/byEmployeeCount/{reportType}" | String: reportType                  | REPORT-SERVICE      |
| GET        | "/report/byEmployeeCount/{reportType}" | String: reportType                  | REPORT-SERVICE      |
| GET        | "/report/oppsByAccount/{dataType}"     | String: dataType                    | REPORT-SERVICE      |
| GET        | "/leads"                               |                                     | LEAD-SERVICE        |
| GET        | "/leads/{id}"                          | long: id                            | LEAD-SERVICE        |
| GET        | "/accounts"                            |                                     | ACCOUNT-SERVICE     |
| GET        | "/accounts/{id}"                       | Long: id                            | ACCOUNT-SERVICE     |
| GET        | "/contacts"                            |                                     | CONTACT-SERVICE     |
| GET        | "/contacts/{id}"                       | Long: id                            | CONTACT-SERVICE     |
| GET        | "/opps/all"                            |                                     | OPPORTUNITY-SERVICE |
| GET        | "/opps/{id}"                           | Long: id                            | OPPORTUNITY-SERVICE |
| GET        | "/salesrep"                            |                                     | SALESREP-SERVICE    |
| GET        | "/salesrep/{id}"                       | Long: id                            | SALESREP-SERVICE    |

## SETUP: Local Method

* Clone the repository
* Open each service, right-click on the pom.xml file and select "Add as Maven project"
* Select "Trust Project"
* Run each service
* All request must have login authentication.
  * Sales rep can access all routes except for: POST** - "/create/salesrep"
  * Admin can access all routes

Authentication for sales rep:

```
login: salesrep
password: salesrep
```

Authentication for admin:

```
login: admin
password: admin
```

| Port | Route Type |                  Route                 |            Input Required           |    Service Called   |
|:----:|:----------:|:--------------------------------------:|:-----------------------------------:|:-------------------:|
| 8700 | POST       | "/create/contact"                      | ContactDTO                          | CREATE-SERVICE      |
| 8700 | POST       | "/create/opportunity"                  | OpportunityDTO                      | CREATE-SERVICE      |
| 8700 | POST       | "/create/lead"                         | LeadDTO                             | CREATE-SERVICE      |
| 8700 | POST       | "/create/account"                      | AccountDTO                          | CREATE-SERVICE      |
| 8700 | POST**     | "/create/salesrep"                     | SalesRepDTO                         | CREATE-SERVICE      |
| 8700 | POST       | "/create/contact-opportunity"          | ContactAndOpportunityDTO            | CREATE-SERVICE      |
| 8700 | POST       | "/create/contact-opportunity-account"  | ContactAndOpportunityAndAccountDTO  | CREATE-SERVICE      |
| 8110 | POST       | "/convert/lead{id}"                    | Long: leadId, LeadConvertDTO        | CONVERT-SERVICE     |
| 8110 | PUT        | "/convert/opportunity/{id}/{status}"   | Long: opportunityId, String: status | CONVERT-SERVICE     |
| 8750 | GET        | "/report/bySalesRep/{dataType}"        | String: dataType                    | REPORT-SERVICE      |
| 8750 | GET        | "/report/byProduct/{dataType}"         | String: dataType                    | REPORT-SERVICE      |
| 8750 | GET        | "/report/byCountry/{dataType}"         | String: dataType                    | REPORT-SERVICE      |
| 8750 | GET        | "/report/byCity/{dataType}"            | String: dataType                    | REPORT-SERVICE      |
| 8750 | GET        | "/report/byIndustry/{dataType}"        | String: dataType                    | REPORT-SERVICE      |
| 8750 | GET        | "/report/byEmployeeCount/{reportType}" | String: reportType                  | REPORT-SERVICE      |
| 8750 | GET        | "/report/byEmployeeCount/{reportType}" | String: reportType                  | REPORT-SERVICE      |
| 8750 | GET        | "/report/oppsByAccount/{dataType}"     | String: dataType                    | REPORT-SERVICE      |
| 8100 | GET        | "/leads"                               |                                     | LEAD-SERVICE        |
| 8100 | GET        | "/leads/{id}"                          | long: id                            | LEAD-SERVICE        |
| 8600 | GET        | "/accounts"                            |                                     | ACCOUNT-SERVICE     |
| 8600 | GET        | "/accounts/{id}"                       | Long: id                            | ACCOUNT-SERVICE     |
| 8080 | GET        | "/contacts"                            |                                     | CONTACT-SERVICE     |
| 8080 | GET        | "/contacts/{id}"                       | Long: id                            | CONTACT-SERVICE     |
| 8200 | GET        | "/opps/all"                            |                                     | OPPORTUNITY-SERVICE |
| 8200 | GET        | "/opps/{id}"                           | Long: id                            | OPPORTUNITY-SERVICE |
| 8650 | GET        | "/salesrep"                            |                                     | SALESREP-SERVICE    |
| 8650 | GET        | "/salesrep/{id}"                       | Long: id                            | SALESREP-SERVICE    |

## Services

- Gateway - https://github.com/NatNorb/gateway
- Discovery - https://github.com/jegor-chomczuk/discovery-service
- Account Service - https://github.com/MaddyKilmurray/CSharks-AccountMicroservice
- SalesRep Service - https://github.com/MaddyKilmurray/CSharks-SalesRepMicroservice
- Opportunity Service - https://github.com/NatNorb/opportunity-service
- Contact Service - https://github.com/jegor-chomczuk/contact-service
- Lead Service - https://github.com/Joaodss/h4-lead-service
- Convert Service - https://github.com/Joaodss/h4-convert-service
- Reporting Service - https://github.com/MaddyKilmurray/CSharks-ReportingService
- Create Service - https://github.com/jegor-chomczuk/create-service

## DTOs

#### ContactDTO

```
{ 
    name: String, 
    phoneNumber: String, 
    email: String, 
    companyName: String, 
    salesRepId: Long, 
    accountId: Long, 
}
```

#### OpportunityDTO

```
{ 
    status: Status, 
    product: Truck, 
    quantity: Integer, 
    decisionMaker: Long, 
    accountId: Long,
    salesRepId: Long
}
```

#### LeadDTO

```
{ 
    name: String, 
    phoneNumber: String, 
    email: String, 
    companyName: String, 
    salesRep: Long,
} 
```

#### AccountDTO

```
{
    id: Long,
    industry: String,
    employeeCount: Integer,
    city: String,
    country: String
}
```

#### SalesRepDTO

```
{ 
    id: Long, 
    repName: String 
}
```

#### ContactAndOpportunityDTO

```
{ 
    name: String,
    phoneNumber: String, 
    email: String,
    companyName: String, 
    salesRepId: Long,
    id: Long,
    status: Status,
    product: Truck,
    quantity: Integer,
    decisionMaker: Long,
    accountId: Long
} 
```

#### ContactAndOpportunityAndAccountDTO

```
{ 
    name: String, 
    phoneNumber: String, 
    email: String, 
    companyName: String,
    salesRepId: Long, 
    status: Status, 
    product: Truck, 
    quantity: Integer, 
    decisionMaker: Long, 
    accountId: Long, 
    id: Long,
    account id,
    industry: String,
    employeeCount: Integer,
    city: String,
    country: String
} 
```

#### LeadConvertDTO (with existing account id)

``` 
{ 
    product: String, 
    quantity: Integer,
    industry: String,
    accountId: Long
} 
```

#### LeadConvertDTO (with new account)

``` 
{ 
    product: String, 
    quantity: Integer,
    industry: String,
    employeeCount: Integer,
    city: String,
    country: String
} 
```

#### LeadConvertDTO (account id exists? yes: use it, no: create new account)

``` 
{ 
    product: String, 
    quantity: Integer,
    industry: String,
    accountId: Long,
    employeeCount: Integer,
    city: String,
    country: String
} 
```

