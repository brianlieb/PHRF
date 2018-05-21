package org.seasailing;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class PhrfApplication extends Application<PhrfConfiguration> {

    public static void main(final String[] args) throws Exception {
        new PhrfApplication().run(args);
    }

    @Override
    public String getName() {
        return "phrf";
    }

    @Override
    public void initialize(final Bootstrap<PhrfConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final PhrfConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
