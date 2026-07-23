CREATE TABLE athletes(
    athlete_id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL
);

CREATE TABLE workouts(
    workout_id SERIAL PRIMARY KEY,
    athlete_id INTEGER REFERENCES athletes(athlete_id),
    date DATE,
    focus_area VARCHAR(100) NOT NULL
);