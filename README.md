# §MSA(Micro Service Architecture) Study Project
___
## §Description
___
간단한 상품 관련 서비스(최소한의 기능 및 정보 제공)를 통해 MSA구축 기초 학습

## §Service
___
- product-composite-service
- product-service
- review-service
- recommendation-serice
## §Domain
___
### Product
- productID : 제품 ID
- name : 이름
- weight : 무게
### Review
- productID : 제품 ID
- reviewID : 리뷰 ID
- author : 작성자 
- title : 제목
- content : 컨텐츠
### Recommendation
- productID : 제품 ID
- RecommendationID : 추천 ID
- author : 작성자
- rate : 평점
- content : 컨텐츠
