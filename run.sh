#!/bin/bash
pack build gcr.io/ankur-cloud-run/hello-ccd --path . --builder heroku/buildpacks && \
docker push gcr.io/ankur-cloud-run/hello-ccd && \
gcloud run deploy hello-ccd\
          --project=ankur-cloud-run\
          --platform=managed\
          --region=asia-northeast1\
          --image=gcr.io/ankur-cloud-run/hello-ccd\
          --memory=512Mi\
          --allow-unauthenticated