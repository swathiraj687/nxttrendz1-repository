create table if not exists review (
    reviewId INT PRIMARY KEY AUTO_INCREMENT,
    reviewContent varchar(255),
    rating INT
)

create table if not exists product (
    productId INT PRIMARY KEY AUTO_INCREMENT,
    productName varchar(255),
    price INT,
    reviewId INT,
    FOREIGN KEY (reviewId) REFERENCES review(reviewId)
);


