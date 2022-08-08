CREATE TABLE person (
    id integer,
    first_name varchar(50) NOT NULL,
    last_name varchar(50) NOT NULL,
    email_address varchar(50) NOT NULL,
    street_address varchar(50) NOT NULL,
    city varchar(50) NOT NULL,
    state varchar(2) NOT NULL,
    zip_code varchar(5) NOT NULL,
    associated_client varchar(25),
    PRIMARY KEY(id),
    UNIQUE(id)
);


CREATE TABLE client (
    client_id integer,
    person_id integer,
    company_name varchar(50) NOT NULL,
    website_URI varchar(50) NOT NULL,
    phone_number varchar (25) NOT NULL,
    mailing_address varchar (50) NOT NULL,
    associated_contact varchar (30),
    PRIMARY KEY (client_id),
    FOREIGN KEY (person_id) 
    REFERENCES person(id)


);

-- Tried to make a relational data table where the 
-- id of a person assocaited with a client
-- would show up under associated_contact 
