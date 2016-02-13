from django import forms
from .models import SignUp

#Controls what fields appear in the "Change sign up" and "Add sign up" pages
class ContactForm(forms.Form):
	full_name = forms.CharField(required=False)
	email = forms.EmailField()
	message = forms.CharField()

class SignUpForm(forms.ModelForm):
	class Meta:
		model = SignUp
		fields = ['full_name', 'email']

	def clean_email(self):
		email = self.cleaned_data.get('email')
		if not extension == 'edu':
			raise forms.ValidationError('Please use a valid .edu email.')
		return email

	def clean_full_name(self):
		full_name = self.cleaned_data.get('full_name')
		#Write validation code.
		return full_name