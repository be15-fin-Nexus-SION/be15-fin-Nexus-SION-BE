DELETE FROM grade WHERE grade_code IN ('S', 'A', 'B', 'C', 'D');

INSERT INTO grade (grade_code, min_score, max_score, monthly_unit_price, created_at, updated_at)
VALUES
    ('S', 90, 100, 10000000, NOW(), NOW()),
    ('A', 80, 89, 9000000, NOW(), NOW()),
    ('B', 70, 79, 8000000, NOW(), NOW()),
    ('C', 60, 69, 7000000, NOW(), NOW()),
    ('D', 0, 59, 6000000, NOW(), NOW());


INSERT INTO tech_stack (tech_stack_name, created_at, updated_at) VALUES
                                                                     ('Java', NOW(), NOW()),
                                                                     ('Spring Boot', NOW(), NOW()),
                                                                     ('Spring', NOW(), NOW()),
                                                                     ('JPA', NOW(), NOW()),
                                                                     ('QueryDSL', NOW(), NOW()),
                                                                     ('MySQL', NOW(), NOW()),
                                                                     ('Redis', NOW(), NOW()),
                                                                     ('Kafka', NOW(), NOW()),
                                                                     ('Docker', NOW(), NOW()),
                                                                     ('Kubernetes', NOW(), NOW()),
                                                                     ('React', NOW(), NOW()),
                                                                     ('Vue.js', NOW(), NOW()),
                                                                     ('TypeScript', NOW(), NOW()),
                                                                     ('JavaScript', NOW(), NOW()),
                                                                     ('Node.js', NOW(), NOW()),
                                                                     ('Express', NOW(), NOW()),
                                                                     ('MongoDB', NOW(), NOW()),
                                                                     ('AWS', NOW(), NOW()),
                                                                     ('Pinia', NOW(), NOW()),
                                                                     ('Vite', NOW(), NOW()),
                                                                     ('HTML', NOW(), NOW()),
                                                                     ('CSS', NOW(), NOW()),
                                                                     ('Go', NOW(), NOW()),
                                                                     ('Gin', NOW(), NOW()),
                                                                     ('gRPC', NOW(), NOW()),
                                                                     ('PostgreSQL', NOW(), NOW()),
                                                                     ('Jest', NOW(), NOW()),
                                                                     ('Next.js', NOW(), NOW()),
                                                                     ('Elasticsearch', NOW(), NOW()),
                                                                     ('Linux', NOW(), NOW()),
                                                                     ('Nginx', NOW(), NOW()),
                                                                     ('Prometheus', NOW(), NOW()),
                                                                     ('Git', NOW(), NOW()),
                                                                     ('Grafana', NOW(), NOW()),
                                                                     ('Gradle', NOW(), NOW()),
                                                                     ('JUnit', NOW(), NOW()),
                                                                     ('Python', NOW(), NOW()),
                                                                     ('Django', NOW(), NOW()),
                                                                     ('Redux', NOW(), NOW()),
                                                                     ('Mockito', NOW(), NOW());

-- 개발자 1 (EMP001)
INSERT INTO `member` (
    `employee_identification_number`,
    `employee_name`,
    `password`,
    `profile_image_url`,
    `phone_number`,
    `joined_at`,
    `email`,
    `career_years`,
    `salary`,
    `status`,
    `grade_code`,
    `created_at`,
    `updated_at`,
    `role`
) VALUES (
             'EMP001',
             '홍길동',
             'hashed_password_1',
             'https://example.com/image1.jpg',
             '01012345601',
             '2022-01-01 09:00:00',
             'hong1@example.com',
             2,
             55000000,
             'AVAILABLE',
             'B',
             NOW(),
             NOW(),
             'INSIDER'
         );

-- 개발자 1이 보유한 기술 스택 10개
INSERT INTO `developer_tech_stack` (
    `developer_tech_stack_id`,
    `tech_stack_total_scores`,
    `employee_identification_number`,
    `tech_stack_name`,
    `created_at`,
    `updated_at`
) VALUES
      (10001, 80, 'EMP001', 'Java', NOW(), NOW()),
      (10002, 75, 'EMP001', 'Spring', NOW(), NOW()),
      (10003, 70, 'EMP001', 'MySQL', NOW(), NOW()),
      (10004, 65, 'EMP001', 'JPA', NOW(), NOW()),
      (10005, 85, 'EMP001', 'Git', NOW(), NOW()),
      (10006, 60, 'EMP001', 'Docker', NOW(), NOW()),
      (10007, 55, 'EMP001', 'Kubernetes', NOW(), NOW()),
      (10008, 90, 'EMP001', 'Vue.js', NOW(), NOW()),
      (10009, 78, 'EMP001', 'HTML', NOW(), NOW()),
      (10010, 82, 'EMP001', 'CSS', NOW(), NOW());

-- 개발자 2 (EMP002)
INSERT INTO `member` (
    `employee_identification_number`,
    `employee_name`,
    `password`,
    `profile_image_url`,
    `phone_number`,
    `joined_at`,
    `email`,
    `career_years`,
    `salary`,
    `status`,
    `grade_code`,
    `created_at`,
    `updated_at`,
    `role`
) VALUES (
             'EMP002',
             '김철수',
             'hashed_password_2',
             'https://example.com/image2.jpg',
             '01012345602',
             '2021-08-15 10:00:00',
             'kim2@example.com',
             4,
             60000000,
             'IN_PROJECT',
             'A',
             NOW(),
             NOW(),
             'INSIDER'
         );

-- 개발자 2가 보유한 기술 스택 10개
INSERT INTO `developer_tech_stack` (
    `developer_tech_stack_id`,
    `tech_stack_total_scores`,
    `employee_identification_number`,
    `tech_stack_name`,
    `created_at`,
    `updated_at`
) VALUES
      (10011, 78, 'EMP002', 'Python', NOW(), NOW()),
      (10012, 88, 'EMP002', 'Django', NOW(), NOW()),
      (10013, 60, 'EMP002', 'MySQL', NOW(), NOW()),
      (10014, 73, 'EMP002', 'Redis', NOW(), NOW()),
      (10015, 67, 'EMP002', 'AWS', NOW(), NOW()),
      (10016, 74, 'EMP002', 'Docker', NOW(), NOW()),
      (10017, 81, 'EMP002', 'Linux', NOW(), NOW()),
      (10018, 59, 'EMP002', 'Nginx', NOW(), NOW()),
      (10019, 69, 'EMP002', 'HTML', NOW(), NOW()),
      (10020, 72, 'EMP002', 'CSS', NOW(), NOW());

-- 개발자 3 (EMP003)
INSERT INTO `member` (
    `employee_identification_number`,
    `employee_name`,
    `password`,
    `profile_image_url`,
    `phone_number`,
    `joined_at`,
    `email`,
    `career_years`,
    `salary`,
    `status`,
    `grade_code`,
    `created_at`,
    `updated_at`,
    `role`
) VALUES (
             'EMP003',
             '이영희',
             'hashed_password_3',
             'https://example.com/image3.jpg',
             '01012345603',
             '2020-05-20 14:00:00',
             'lee3@example.com',
             5,
             63000000,
             'UNAVAILABLE',
             'A',
             NOW(),
             NOW(),
             'INSIDER'
         );

-- 개발자 3이 보유한 기술 스택 10개
INSERT INTO `developer_tech_stack` (
    `developer_tech_stack_id`,
    `tech_stack_total_scores`,
    `employee_identification_number`,
    `tech_stack_name`,
    `created_at`,
    `updated_at`
) VALUES
      (10021, 88, 'EMP003', 'JavaScript', NOW(), NOW()),
      (10022, 85, 'EMP003', 'React', NOW(), NOW()),
      (10023, 77, 'EMP003', 'TypeScript', NOW(), NOW()),
      (10024, 62, 'EMP003', 'Node.js', NOW(), NOW()),
      (10025, 70, 'EMP003', 'Express', NOW(), NOW()),
      (10026, 79, 'EMP003', 'MongoDB', NOW(), NOW()),
      (10027, 64, 'EMP003', 'AWS', NOW(), NOW()),
      (10028, 73, 'EMP003', 'Jest', NOW(), NOW()),
      (10029, 68, 'EMP003', 'HTML', NOW(), NOW()),
      (10030, 75, 'EMP003', 'CSS', NOW(), NOW());

-- 개발자 4 (EMP004)
INSERT INTO `member` (
    `employee_identification_number`,
    `employee_name`,
    `password`,
    `profile_image_url`,
    `phone_number`,
    `joined_at`,
    `email`,
    `career_years`,
    `salary`,
    `status`,
    `grade_code`,
    `created_at`,
    `updated_at`,
    `role`
) VALUES (
             'EMP004',
             '박민수',
             'hashed_password_4',
             'https://example.com/image4.jpg',
             '01012345604',
             '2019-03-10 11:30:00',
             'park4@example.com',
             6,
             68000000,
             'AVAILABLE',
             'S',
             NOW(),
             NOW(),
             'INSIDER'
         );

-- 개발자 4가 보유한 기술 스택 10개
INSERT INTO `developer_tech_stack` (
    `developer_tech_stack_id`,
    `tech_stack_total_scores`,
    `employee_identification_number`,
    `tech_stack_name`,
    `created_at`,
    `updated_at`
) VALUES
      (10031, 92, 'EMP004', 'Java', NOW(), NOW()),
      (10032, 89, 'EMP004', 'Spring Boot', NOW(), NOW()),
      (10033, 86, 'EMP004', 'JPA', NOW(), NOW()),
      (10034, 84, 'EMP004', 'QueryDSL', NOW(), NOW()),
      (10035, 77, 'EMP004', 'MySQL', NOW(), NOW()),
      (10036, 80, 'EMP004', 'Redis', NOW(), NOW()),
      (10037, 83, 'EMP004', 'Kafka', NOW(), NOW()),
      (10038, 75, 'EMP004', 'Docker', NOW(), NOW()),
      (10039, 70, 'EMP004', 'Kubernetes', NOW(), NOW()),
      (10040, 78, 'EMP004', 'Linux', NOW(), NOW());

-- 개발자 5 (EMP005)
INSERT INTO `member` (
    `employee_identification_number`,
    `employee_name`,
    `password`,
    `profile_image_url`,
    `phone_number`,
    `joined_at`,
    `email`,
    `career_years`,
    `salary`,
    `status`,
    `grade_code`,
    `created_at`,
    `updated_at`,
    `role`
) VALUES (
             'EMP005',
             '최지은',
             'hashed_password_5',
             'https://example.com/image5.jpg',
             '01012345605',
             '2018-11-22 09:20:00',
             'choi5@example.com',
             7,
             72000000,
             'IN_PROJECT',
             'S',
             NOW(),
             NOW(),
             'INSIDER'
         );

-- 개발자 5가 보유한 기술 스택 10개
INSERT INTO `developer_tech_stack` (
    `developer_tech_stack_id`,
    `tech_stack_total_scores`,
    `employee_identification_number`,
    `tech_stack_name`,
    `created_at`,
    `updated_at`
) VALUES
      (10041, 95, 'EMP005', 'Go', NOW(), NOW()),
      (10042, 88, 'EMP005', 'Gin', NOW(), NOW()),
      (10043, 83, 'EMP005', 'gRPC', NOW(), NOW()),
      (10044, 76, 'EMP005', 'PostgreSQL', NOW(), NOW()),
      (10045, 82, 'EMP005', 'Redis', NOW(), NOW()),
      (10046, 90, 'EMP005', 'Docker', NOW(), NOW()),
      (10047, 85, 'EMP005', 'Kubernetes', NOW(), NOW()),
      (10048, 78, 'EMP005', 'AWS', NOW(), NOW()),
      (10049, 73, 'EMP005', 'Prometheus', NOW(), NOW()),
      (10050, 79, 'EMP005', 'Grafana', NOW(), NOW());

-- 개발자 6 (EMP006)
INSERT INTO `member` (
    `employee_identification_number`,
    `employee_name`,
    `password`,
    `profile_image_url`,
    `phone_number`,
    `joined_at`,
    `email`,
    `career_years`,
    `salary`,
    `status`,
    `grade_code`,
    `created_at`,
    `updated_at`,
    `role`
) VALUES (
             'EMP006',
             '이도윤',
             'hashed_password_6',
             'https://example.com/image6.jpg',
             '01012345606',
             '2021-01-14 10:10:00',
             'lee6@example.com',
             3,
             49000000,
             'AVAILABLE',
             'B',
             NOW(),
             NOW(),
             'INSIDER'
         );

-- 개발자 6이 보유한 기술 스택 10개
INSERT INTO `developer_tech_stack` (
    `developer_tech_stack_id`,
    `tech_stack_total_scores`,
    `employee_identification_number`,
    `tech_stack_name`,
    `created_at`,
    `updated_at`
) VALUES
      (10051, 82, 'EMP006', 'JavaScript', NOW(), NOW()),
      (10052, 85, 'EMP006', 'TypeScript', NOW(), NOW()),
      (10053, 78, 'EMP006', 'React', NOW(), NOW()),
      (10054, 81, 'EMP006', 'Redux', NOW(), NOW()),
      (10055, 75, 'EMP006', 'Next.js', NOW(), NOW()),
      (10056, 79, 'EMP006', 'Node.js', NOW(), NOW()),
      (10057, 77, 'EMP006', 'Express', NOW(), NOW()),
      (10058, 73, 'EMP006', 'MongoDB', NOW(), NOW()),
      (10059, 70, 'EMP006', 'Docker', NOW(), NOW()),
      (10060, 68, 'EMP006', 'AWS', NOW(), NOW());

-- 개발자 7 (EMP007)
INSERT INTO `member` (
    `employee_identification_number`,
    `employee_name`,
    `password`,
    `profile_image_url`,
    `phone_number`,
    `joined_at`,
    `email`,
    `career_years`,
    `salary`,
    `status`,
    `grade_code`,
    `created_at`,
    `updated_at`,
    `role`
) VALUES (
             'EMP007',
             '장하늘',
             'hashed_password_7',
             'https://example.com/image7.jpg',
             '01012345607',
             '2020-06-11 08:40:00',
             'jang7@example.com',
             4,
             56000000,
             'IN_PROJECT',
             'B',
             NOW(),
             NOW(),
             'OUTSIDER'
         );

-- 개발자 7이 보유한 기술 스택 10개
INSERT INTO `developer_tech_stack` (
    `developer_tech_stack_id`,
    `tech_stack_total_scores`,
    `employee_identification_number`,
    `tech_stack_name`,
    `created_at`,
    `updated_at`
) VALUES
      (10061, 80, 'EMP007', 'Vue.js', NOW(), NOW()),
      (10062, 76, 'EMP007', 'Pinia', NOW(), NOW()),
      (10063, 74, 'EMP007', 'Vite', NOW(), NOW()),
      (10064, 71, 'EMP007', 'JavaScript', NOW(), NOW()),
      (10065, 70, 'EMP007', 'TypeScript', NOW(), NOW()),
      (10066, 68, 'EMP007', 'Node.js', NOW(), NOW()),
      (10067, 66, 'EMP007', 'Express', NOW(), NOW()),
      (10068, 72, 'EMP007', 'MySQL', NOW(), NOW()),
      (10069, 69, 'EMP007', 'Docker', NOW(), NOW()),
      (10070, 67, 'EMP007', 'AWS', NOW(), NOW());

-- 개발자 8 (EMP008)
INSERT INTO `member` (
    `employee_identification_number`,
    `employee_name`,
    `password`,
    `profile_image_url`,
    `phone_number`,
    `joined_at`,
    `email`,
    `career_years`,
    `salary`,
    `status`,
    `grade_code`,
    `created_at`,
    `updated_at`,
    `role`
) VALUES (
             'EMP008',
             '최서윤',
             'hashed_password_8',
             'https://example.com/image8.jpg',
             '01012345608',
             '2019-09-20 14:00:00',
             'choi8@example.com',
             6,
             61000000,
             'AVAILABLE',
             'A',
             NOW(),
             NOW(),
             'INSIDER'
         );

-- 개발자 8이 보유한 기술 스택 10개
INSERT INTO `developer_tech_stack` (
    `developer_tech_stack_id`,
    `tech_stack_total_scores`,
    `employee_identification_number`,
    `tech_stack_name`,
    `created_at`,
    `updated_at`
) VALUES
      (10071, 88, 'EMP008', 'Java', NOW(), NOW()),
      (10072, 84, 'EMP008', 'Spring Boot', NOW(), NOW()),
      (10073, 80, 'EMP008', 'JPA', NOW(), NOW()),
      (10074, 79, 'EMP008', 'MySQL', NOW(), NOW()),
      (10075, 76, 'EMP008', 'Redis', NOW(), NOW()),
      (10076, 78, 'EMP008', 'AWS', NOW(), NOW()),
      (10077, 74, 'EMP008', 'Docker', NOW(), NOW()),
      (10078, 77, 'EMP008', 'JUnit', NOW(), NOW()),
      (10079, 72, 'EMP008', 'Mockito', NOW(), NOW()),
      (10080, 70, 'EMP008', 'Gradle', NOW(), NOW());

-- 개발자 9 (EMP009)
INSERT INTO `member` (
    `employee_identification_number`,
    `employee_name`,
    `password`,
    `profile_image_url`,
    `phone_number`,
    `joined_at`,
    `email`,
    `career_years`,
    `salary`,
    `status`,
    `grade_code`,
    `created_at`,
    `updated_at`,
    `role`
) VALUES (
             'EMP009',
             '한유정',
             'hashed_password_9',
             'https://example.com/image9.jpg',
             '01012345609',
             '2021-02-05 10:15:00',
             'han9@example.com',
             3,
             53000000,
             'UNAVAILABLE',
             'C',
             NOW(),
             NOW(),
             'OUTSIDER'
         );

-- 개발자 9이 보유한 기술 스택 10개
INSERT INTO `developer_tech_stack` (
    `developer_tech_stack_id`,
    `tech_stack_total_scores`,
    `employee_identification_number`,
    `tech_stack_name`,
    `created_at`,
    `updated_at`
) VALUES
      (10081, 82, 'EMP009', 'Vue.js', NOW(), NOW()),
      (10082, 78, 'EMP009', 'Pinia', NOW(), NOW()),
      (10083, 76, 'EMP009', 'Vite', NOW(), NOW()),
      (10084, 74, 'EMP009', 'JavaScript', NOW(), NOW()),
      (10085, 72, 'EMP009', 'TypeScript', NOW(), NOW()),
      (10086, 70, 'EMP009', 'Node.js', NOW(), NOW()),
      (10087, 68, 'EMP009', 'Express', NOW(), NOW()),
      (10088, 66, 'EMP009', 'MongoDB', NOW(), NOW()),
      (10089, 69, 'EMP009', 'Docker', NOW(), NOW()),
      (10090, 71, 'EMP009', 'AWS', NOW(), NOW());

-- 개발자 10 (EMP010)
INSERT INTO `member` (
    `employee_identification_number`,
    `employee_name`,
    `password`,
    `profile_image_url`,
    `phone_number`,
    `joined_at`,
    `email`,
    `career_years`,
    `salary`,
    `status`,
    `grade_code`,
    `created_at`,
    `updated_at`,
    `role`
) VALUES (
             'EMP010',
             '정민수',
             'hashed_password_10',
             'https://example.com/image10.jpg',
             '01012345610',
             '2017-06-30 13:45:00',
             'jung10@example.com',
             8,
             72000000,
             'IN_PROJECT',
             'S',
             NOW(),
             NOW(),
             'INSIDER'
         );

-- 개발자 10이 보유한 기술 스택 10개
INSERT INTO `developer_tech_stack` (
    `developer_tech_stack_id`,
    `tech_stack_total_scores`,
    `employee_identification_number`,
    `tech_stack_name`,
    `created_at`,
    `updated_at`
) VALUES
      (10091, 92, 'EMP010', 'Java', NOW(), NOW()),
      (10092, 89, 'EMP010', 'Spring Boot', NOW(), NOW()),
      (10093, 85, 'EMP010', 'JPA', NOW(), NOW()),
      (10094, 83, 'EMP010', 'MySQL', NOW(), NOW()),
      (10095, 80, 'EMP010', 'Redis', NOW(), NOW()),
      (10096, 78, 'EMP010', 'AWS', NOW(), NOW()),
      (10097, 76, 'EMP010', 'Docker', NOW(), NOW()),
      (10098, 74, 'EMP010', 'Kubernetes', NOW(), NOW()),
      (10099, 79, 'EMP010', 'Kafka', NOW(), NOW()),
      (10100, 81, 'EMP010', 'Elasticsearch', NOW(), NOW());

