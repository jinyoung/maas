# 

## Model
www.msaez.io/#/storming/maas

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- Transportation Service
- Payment Service
- Vehicle Service
- User Experience Service
- Accessibility Service


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- Transportation Service
```
 http :8088/reservations reservationId="reservationId" transportationType="transportationType" pickUpLocation="pickUpLocation" dropOffLocation="dropOffLocation" pickUpDateTime="pickUpDateTime" dropOffDateTime="dropOffDateTime" status="status" 
 http :8088/userPreferences userId="userId" accessibleTransportation="accessibleTransportation" assistanceRequired="assistanceRequired" language="language" 
```
- Payment Service
```
 http :8088/payments paymentId="paymentId" reservationId="reservationId" amount="amount" status="status" 
```
- Vehicle Service
```
 http :8088/vehicles vehicleId="vehicleId" type="type" model="model" driver="driver" licensePlate="licensePlate" 
```
- User Experience Service
```
 http :8088/voicePrompts voicePromptId="voicePromptId" reservationId="reservationId" userId="userId" message="message" language="language" 
```
- Accessibility Service
```
 http :8088/accessibilityInfos accessibilityId="accessibilityId" transportationType="transportationType" isAccessible="isAccessible" assistancesAvailable="assistancesAvailable" language="language" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

