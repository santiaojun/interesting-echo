# Interesting-Echo
AWS-Based Cloud Service DeploymentDeveloped and containerized a Spring Boot web service using Docker, ensuring consistency across development and production environments. This project demonstrates the full lifecycle of a containerized Java application deployed on AWS.

Interesting Echo 📡
A lightweight, containerized Spring Boot service deployed on AWS, designed to demonstrate the full lifecycle of cloud-native application orchestration.

🚀 Project Overview
Interesting Echo is more than just a "Hello World". It’s a complete end-to-end demonstration of modern DevOps practices, taking a Java backend from local development to a highly available cloud environment.

🛠 Tech Stack
Backend: Spring Boot (Java)

Containerization: Docker

Image Registry: Amazon ECR (Elastic Container Registry)

Orchestration: Amazon ECS (Elastic Container Service) on AWS Fargate

Networking: Application Load Balancer (ALB)

🏗 System Architecture
Develop: Build a Spring Boot REST API that "echoes" a greeting.

Containerize: Package the application into a Docker image.

Ship: Push the image to Amazon ECR for secure hosting.

Deploy: Run the container on Amazon ECS, managed by an Application Load Balancer to ensure it's reachable and healthy.

🔗 Live Verification
The service was verified by sending GET requests to the ALB DNS endpoint.

Success Response: 
you say: hello! my name is santiaojun~
It says: hello! my name is santiaojun~
