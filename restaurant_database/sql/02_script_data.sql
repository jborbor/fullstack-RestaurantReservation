INSERT INTO db_restaurant.districts(name)
VALUES
('Cercado de Lima'),
('Ate'),
('Barranco'),
('Breña'),
('Comas'),
('Chorrillos'),
('El Agustino'),
('Jesús María'),
('La Molina'),
('La Victoria');

INSERT INTO db_restaurant.restaurants(id, address, capacity, name, phone_number, price_per_person, district_id)
VALUES
(1, 'Av. Abancay 123', 100, 'Restaurante Lima Centro', '01-1234567', 50.00, 1),
(2, 'Jr. De La Unión 456', 80, 'Café El Centro', '01-2345678', 30.00, 1),
(3, 'Av. Javier Prado Este 789', 150, 'Ate Sazón', '01-3456789', 45.00, 2),
(4, 'Av. Metropolitana 101', 120, 'Sabor a Ate', '01-4567890', 35.00, 2),
(5, 'Av. San Martín 102', 70, 'Barranco Bites', '01-5678901', 60.00, 3),
(6, 'Jr. Bolognesi 203', 90, 'Café Barranco', '01-6789012', 40.00, 3),
(7, 'Av. Venezuela 304', 90, 'Breña Gourmet', '01-7890123', 50.00, 4),
(8, 'Jr. Varela 405', 110, 'Sazón de Breña', '01-8901234', 35.00, 4),
(9, 'Av. Universitaria 506', 200, 'Comas Fest', '01-9012345', 25.00, 5),
(10, 'Jr. Puno 607', 80, 'Comas Plaza', '01-0123456', 20.00, 5),
(11, 'Av. Huaylas 708', 150, 'Chorrillos Delicias', '01-1234560', 45.00, 6),
(12, 'Jr. Colina 889', 120, 'Mar de Chorrillos', '01-2345670', 35.00, 6),
(13, 'Av. Riva Agüero 910', 100, 'El Agustino Sabor', '01-3456780', 40.00, 7),
(14, 'Jr. San Felipe 101', 90, 'Agustino Tradición', '01-4567891', 30.00, 7),
(15, 'Av. Salaverry 112', 140, 'Jesús María Gourmet', '01-5678902', 50.00, 8),
(16, 'Jr. Huiracocha 213', 130, 'Delicias de Jesús María', '01-6789013', 45.00, 8),
(17, 'Av. La Fontana 314', 180, 'La Molina Verde', '01-7890124', 55.00, 9),
(18, 'Jr. La Punta 415', 170, 'Sabores de La Molina', '01-8901235', 50.00, 9),
(19, 'Av. Grau 516', 200, 'Victoria Cocina', '01-9012346', 35.00, 10),
(20, 'Jr. Mendoza 617', 150, 'La Victoria Tradición', '01-0123457', 30.00, 10);