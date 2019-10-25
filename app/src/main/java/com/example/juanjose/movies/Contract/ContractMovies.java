package com.example.juanjose.movies.Contract;

import com.example.juanjose.movies.AdapterMovies;

public interface ContractMovies {
    interface ViewM{

    }
    interface PresenterM{
        void peticion(AdapterMovies adapterMovies);
    }
}
