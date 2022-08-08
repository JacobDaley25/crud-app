INSERT INTO person (
    id,
    first_name,
    last_name,
    email_address,
    street_address,
    city,
    state,
    zip_code,
    associated_client
) VALUES (
    '1',
    'John',
    'Smith',
    'fake1@aquent.com',
    '123 Any St.',
    'Asheville',
    'NC',
    '28801',
    'Aquent'
), (
    '2',
    'Jane',
    'Smith',
    'fake2@aquent.com',
    '123 Any St.',
    'Asheville',
    'NC',
    '28801',
    'Aquent'
);

INSERT INTO client(
    client_id,
    person_id,
    company_name,
    website_URI,
    phone_number,
    mailing_address

) VALUES(
    '1',
    '1',
    'Aquent',
    'www.aquent.com',
    '555-555-5555',
    'somewhere USA'
);