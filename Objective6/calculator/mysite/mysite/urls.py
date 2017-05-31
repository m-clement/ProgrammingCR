from django.conf.urls import include, url
from django.contrib import admin

urlpatterns = [
    url(r'^calculator/', include('calculator.urls')),
    url(r'^polls/', include('polls.urls')),
	url(r'^admin/', admin.site.urls),
]