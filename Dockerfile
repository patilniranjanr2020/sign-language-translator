# Use Python base image
FROM python:3.10-slim

# Set working directory
WORKDIR /app

# Copy project files
COPY . .

# Install Python dependencies
RUN pip install --upgrade pip && pip install -r requirements.txt

# Expose app port (change if different)
EXPOSE 5000

# Run your main app
CMD ["python", "app.py"]
