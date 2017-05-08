# Our first Django app
### we followed https://docs.djangoproject.com/en/1.11/intro/tutorial01/

## To install and verify django, we ran ...

which virtualenvwrapper.sh

source /Library/Frameworks/Python.framework/Versions/3.4/bin/virtualenvwrapper.sh

mkvirtualenv env1

pip install django

lssitepackages

python -m django --version


* do note that we're not sure this is a repeatable process.


## Then, once Django appeared ready to use, we created a 'project' ...

cd projects-personal/ProgrammingCR/Objective6/calculator/

rm -rf mysite # in case we already had a copy

python -m django --version

django-admin startproject mysite

cd mysite

python manage.py migrate

python manage.py runserver

## And then created an 'app' ...

python manage.py startapp polls

we modified urls.py files and views.py

python manage.py runserver

tested it by visiting http://127.0.0.1:8000/polls
