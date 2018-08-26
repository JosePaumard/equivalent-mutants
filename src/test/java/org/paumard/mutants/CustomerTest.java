package org.paumard.mutants;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.paumard.mutants.model.Movie;
import org.paumard.mutants.model.Rental;
import org.paumard.mutants.model.Tape;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void should_return_the_right_message_when_there_is_no_rental() {
        //Given
        Customer customer = new Customer("Remy");
        String expected = "Rental Record for Remy\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points";
        //When
        String statement = customer.statement();
        //Then
        Assertions.assertThat(statement).isEqualTo(expected);
    }

    @Test
    public void should_return_the_right_message_for_a_rental_with_one_movie_of_type_new_release() {
        //Given
        Customer customer = new Customer("Remy");
        Movie movie = new Movie("Star wars 8", Movie.NEW_RELEASE);
        Tape tape = new Tape("1234", movie);
        Rental rental = new Rental(tape, 1);
        customer.addRental(rental);

        String expected = "Rental Record for Remy\n" +
                "\tStar wars 8\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points";
        //When
        String statement = customer.statement();
        //Then
        Assertions.assertThat(statement).isEqualTo(expected);
    }

    @Test
    public void should_return_the_right_message_for_a_rental_with_one_movie_of_type_regular_rented_for_2_days() {
        //Given
        Customer customer = new Customer("Remy");
        Movie movie = new Movie("Star wars 8", Movie.REGULAR);
        Tape tape = new Tape("1234", movie);
        Rental rental = new Rental(tape, 2);
        customer.addRental(rental);

        String expected = "Rental Record for Remy\n" +
                "\tStar wars 8\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points";
        //When
        String statement = customer.statement();
        //Then
        Assertions.assertThat(statement).isEqualTo(expected);
    }

    @Test
    public void should_return_the_right_message_for_a_rental_with_one_movie_of_type_regular_rented_for_3_days() {
        //Given
        Customer customer = new Customer("Remy");
        Movie movie = new Movie("Star wars 8", Movie.REGULAR);
        Tape tape = new Tape("1234", movie);
        Rental rental = new Rental(tape, 3);
        customer.addRental(rental);

        String expected = "Rental Record for Remy\n" +
                "\tStar wars 8\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points";
        //When
        String statement = customer.statement();
        //Then
        Assertions.assertThat(statement).isEqualTo(expected);
    }

    @Test
    public void should_return_the_right_message_for_a_rental_with_one_movie_of_type_childrens_rented_for_22_days() {
        //Given
        Customer customer = new Customer("Remy");
        Movie movie = new Movie("Star wars 8", Movie.CHILDRENS);
        Tape tape = new Tape("12345", movie);
        Rental rental = new Rental(tape, 22);
        customer.addRental(rental);

        String expected = "Rental Record for Remy\n" +
                "\tStar wars 8\t30.0\n" +
                "Amount owed is 30.0\n" +
                "You earned 1 frequent renter points";
        //When
        String statement = customer.statement();
        //Then
        Assertions.assertThat(statement).isEqualTo(expected);
    }

    @Test
    public void should_return_the_right_message_for_a_rental_with_one_movie_of_type_childrens_rented_for_1_day() {
        //Given
        Customer customer = new Customer("Remy");
        Movie movie = new Movie("Star wars 8", Movie.CHILDRENS);
        Tape tape = new Tape("12345", movie);
        Rental rental = new Rental(tape, 1);
        customer.addRental(rental);

        String expected = "Rental Record for Remy\n" +
                "\tStar wars 8\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points";
        //When
        String statement = customer.statement();
        //Then
        Assertions.assertThat(statement).isEqualTo(expected);
    }

    @Test
    public void should_return_the_right_message_for_a_rental_with_one_movie_of_type_childrens_rented_for_3_days() {
        //Given
        Customer customer = new Customer("Remy");
        Movie movie = new Movie("Star wars 8", Movie.CHILDRENS);
        Tape tape = new Tape("12345", movie);
        Rental rental = new Rental(tape, 3);
        customer.addRental(rental);

        String expected = "Rental Record for Remy\n" +
                "\tStar wars 8\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points";
        //When
        String statement = customer.statement();
        //Then
        Assertions.assertThat(statement).isEqualTo(expected);
    }

    @Test
    public void should_return_the_right_message_for_a_rental_with_one_movie_of_type_childrens_rented_for_4_days() {
        //Given
        Customer customer = new Customer("Remy");
        Movie movie = new Movie("Star wars 8", Movie.CHILDRENS);
        Tape tape = new Tape("12345", movie);
        Rental rental = new Rental(tape, 4);
        customer.addRental(rental);

        String expected = "Rental Record for Remy\n" +
                "\tStar wars 8\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points";
        //When
        String statement = customer.statement();
        //Then
        Assertions.assertThat(statement).isEqualTo(expected);
    }

    @Test
    public void should_return_the_right_message_for_a_rental_with_one_movie_of_type_new_release_rented_for_3_days() {
        //Given
        Customer customer = new Customer("Remy");
        Movie movie = new Movie("Star wars 8", Movie.NEW_RELEASE);
        Tape tape = new Tape("12345", movie);
        Rental rental = new Rental(tape, 3);
        customer.addRental(rental);

        String expected = "Rental Record for Remy\n" +
                "\tStar wars 8\t9.0\n" +
                "Amount owed is 9.0\n" +
                "You earned 2 frequent renter points";
        //When
        String statement = customer.statement();
        //Then
        Assertions.assertThat(statement).isEqualTo(expected);
    }

}