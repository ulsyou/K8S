# Create image based on the official Node 12 image from dockerhub
FROM node:12-alpine
# Create a directory where our app will be placed
RUN mkdir -p /usr/src/app
# Change directory so that our commands run inside this new directory
WORKDIR /usr/src/app
# Get package.json and package-lock.json to run the app
COPY package.json package-lock.json /usr/src/app/
# Install dependecies
RUN npm ci
# Get all code
COPY . .
# Expose the port the app runs in
EXPOSE 4200
# Serve the app
CMD ["npm", "start"]
