#include <cmath>

double daily_rate(double hourly_rate) {
    return hourly_rate * 8.0;
}

double apply_discount(double before_discount, double discount) {
    return before_discount - (before_discount * discount / 100);
}

int monthly_rate(double hourly_rate, double discount) {
    double monthly = hourly_rate * 8 * 22;
    return static_cast<int>(std::ceil(apply_discount(monthly, discount)));
}

int days_in_budget(int budget, double hourly_rate, double discount) {
    double rate = apply_discount(daily_rate(hourly_rate), discount);
    return static_cast<int>(std::floor(budget / rate));
}