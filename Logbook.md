# Project Logbook

**Project Name:** Customer Churn Prediction  
**Author:** Alex Johnson  
**GitHub Repository:** [github.com/alexjohnson/churn-prediction](https://github.com/alexjohnson/churn-prediction)  

---

## Week 1: Project Setup

### 2025-04-22
- **Progress:**
  - Created GitHub repository `churn-prediction`.
  - Initialized project structure:
    ```
    /data (raw datasets)
    /notebooks (Jupyter notebooks)
    /src (Python scripts)
    /docs (documentation)
    ```
  - Added `README.md` with project goals and dependencies.
- **Challenges:**
  - PySpark installation conflicted with existing Python 3.11 (resolved by creating a Conda environment).
- **Next Steps:**
  - Find a customer churn dataset (target: telecom or banking industry).

---

## Week 2: Data Exploration

### 2025-04-25
- **Progress:**
  - Downloaded [Telco Customer Churn dataset](https://www.kaggle.com/datasets/blastchar/telco-customer-churn) (7043 rows × 21 columns).
  - Created `notebooks/eda.ipynb` with:
    - Missing value analysis (11 missing values in "TotalCharges" column).
    - Visualizations (histograms for tenure, correlation heatmap).
- **Challenges:**
  - Categorical variables ("PaymentMethod", "Contract") required one-hot encoding.
- **Next Steps:**
  - Preprocess data (impute missing values, scale numerical features).

---

## Week 3: Model Development

### 2025-04-28
- **Progress:**
  - Implemented in `src/train.py`:
    ```python
    from sklearn.ensemble import RandomForestClassifier
    model = RandomForestClassifier(n_estimators=100, max_depth=5)
    ```
  - Achieved metrics:
    ```
    Accuracy:
